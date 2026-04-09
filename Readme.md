## Optimization Technique: JIT Warm-up (Static Block)

This technique is a "final boss" optimization used in Competitive Programming and high-performance Java applications to force the JVM (Java Virtual Machine) to compile code into native machine code early, bypassing the initial, slower interpretation phase.

### Objective
* **Pre-empt JIT Compilation:** Trigger the Just-In-Time (JIT) compiler to optimize "Hot Methods" before the actual system test cases run.
* **Performance Gains:** Minimize runtime overhead during the evaluation phase of competitive programming platforms (e.g., LeetCode, Codeforces).

### Implementation
Use a `static` block to execute the target method with "dummy" parameters before the class fully loads or the test runner kicks in.



```java
static {
    // Execute the method multiple times to trigger JIT Compilation
    // "0" acts as a dummy parameter to satisfy the method signature
    for (int i = 0; i < 500; i++) {
        new Solution().minPartitions("0");
    }
}
```

* **Note:** This technique is a micro-optimazation. It cant compensate for an inefficient algorithm.
