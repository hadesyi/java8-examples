package tk.hadeslee.BJ8LF.Annotations;

/**
 * Project: java8-examples
 * FileName: Manager
 * Date: 2015-12-09
 * Time: 오전 1:24
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Manager extends Employee {
    //    Override setSalary() in the Employee class
    public void setSalary(int salary) {
        System.out.println("Menager.setSalary():" + salary);
    }
}
