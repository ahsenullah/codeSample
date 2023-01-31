package exercise.jobs;

/**
 *
 * The job applicant and his/her submission
 *
 */
public class Applicant {
    private String first;
    private String last;

    private int appliedDay;
    private int withdrawnDay;

    public Applicant(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public Applicant(String first, String last, int appliedDay, int withdrawnDay) {
        this(first, last);
        this.appliedDay = appliedDay;
        this.withdrawnDay = withdrawnDay;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public int getAppliedDay() {
        return appliedDay;
    }

    public int getWithdrawnDay() {
        return withdrawnDay;
    }

}
