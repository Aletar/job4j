package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Fix bugs", 5),
                new Job("Impl task", 2),
                new Job("Impe task", 2),
                new Job("Impl task", 1),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs, new JobAscByName());
        System.out.println(jobs);
        Collections.sort(jobs, new JobDescByName());
        System.out.println(jobs);
        Collections.sort(jobs, new JobAscByPriority());
        System.out.println(jobs);
        Collections.sort(jobs, new JobDescByPriority());
        System.out.println(jobs);
        Collections.sort(jobs, new JobAscByName().thenComparing(new JobAscByPriority()));
        System.out.println(jobs);
    }
}
