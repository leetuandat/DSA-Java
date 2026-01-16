package DsaMat3514.FinalTerm.Bai1p3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class PatientManager
{
    // Đọc dữ liệu từ tệp input.txt
    public static List<Patient> readFromFile(String filename) {
        List<Patient> patients = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String id = parts[0].trim();
                    String name = parts[1].trim();
                    int severity = Integer.parseInt(parts[2].trim());
                    patients.add(new Patient(id, name, severity));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Khoong tim thay file: " + filename);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }

        return patients;
    }

    // Trả về hàng đợi ưu tiên từ danh sách bệnh nhân (bệnh nhân có mức độ nghiêm trọng thấp sẽ có độ ưu tiên cao)
    public PriorityQueue<Patient> getPriorityPatients(List<Patient> patients) {
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>();
        for (Patient patient : patients) {
            priorityQueue.offer(patient);
        }
        return priorityQueue;
    }

    // Trả về danh sách bệnh nhân có mức độ nghiêm trọng là 1
    public List<Patient> getHighestPriorityPatients(PriorityQueue<Patient> queue) {
        List<Patient> highestPriority = new ArrayList<>();
        PriorityQueue<Patient> tempQueue = new PriorityQueue<>(queue);
        while (!tempQueue.isEmpty()) {
            Patient patient = tempQueue.poll();
            if (patient.severity == 1) {
                highestPriority.add(patient);
            }
        }
        return highestPriority;
    }
}