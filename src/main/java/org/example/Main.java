package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Task> annsTasks=new HashSet<>();

        Task taskAnn=new Task("Work", "Work desc1","Ann",Status.IN_PROGRESS, Priority.HIGH);
        Task taskAnn2=new Task("Workin", "Workin desc","Ann",Status.IN_QUEUE, Priority.HIGH);

        annsTasks.add(taskAnn2);
        annsTasks.add(taskAnn);

        Set<Task> bobsTasks=new HashSet<>();

        Task taskBob=new Task("Work", "Work desc1","Bob", Status.IN_PROGRESS, Priority.HIGH);
        Task taskBob2=new Task("Workin", "Workin desc2","Bob", Status.ASSIGNED, Priority.LOW);

        bobsTasks.add(taskBob2);
        bobsTasks.add(taskBob);

        Set<Task> carolsTasks =new HashSet<>();

        Task taskCarol=new Task("Work", "Work desc2","Carol", Status.IN_PROGRESS, Priority.HIGH);
        Task taskCarol2=new Task("Workin", "Workin desc2","Carol", Status.IN_QUEUE, Priority.LOW);

        carolsTasks.add(taskCarol2);
        carolsTasks.add(taskCarol);

        Set<Task> unassignedTasks =new HashSet<>();

        Task taskMix=new Task("Work", "Work desc3","Mix", Status.IN_QUEUE, Priority.LOW);
        Task taskMix2=new Task("Workin", "Workin desc3","Mix", Status.IN_QUEUE, Priority.MED);

        unassignedTasks.add(taskMix);
        unassignedTasks.add(taskMix2);

        TaskData taskData=new TaskData(annsTasks,bobsTasks,carolsTasks,unassignedTasks);

        System.out.println("Bobs tasks= "+" "+ taskData.getTasks("bob"));
        System.out.println("anns tasks= "+" "+ taskData.getTasks("ann"));
        System.out.println("carols tasks= "+" "+  taskData.getTasks("carol"));
        System.out.println("alls tasks= "+" "+  taskData.getTasks("all"));
        System.out.println("unassigned tasks= "+ " "+ taskData.getTasks("unassigned"));
        System.out.println(taskData.getIntersection(annsTasks,carolsTasks));
        System.out.println(taskData.getIntersection(bobsTasks,carolsTasks));
        System.out.println(taskData.getIntersection(bobsTasks,annsTasks));

        StringSet.findUniqueWords();
    }
}