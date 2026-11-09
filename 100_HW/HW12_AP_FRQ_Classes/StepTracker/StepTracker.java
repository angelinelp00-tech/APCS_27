public class StepTracker{
    int stepsNeeded;
    int days;
    int totalSteps
    int activeDays;

    public StepTracker(int a){
        stepsNeeded = a;
        days = 0;
        totalSteps = 0;
        activeDays = 0;
    }


    public void addDailySteps(int a){
        int dailySteps = a;
        days++;
        totalSteps = totalSteps + a;
        if(dailySteps >= stepsNeeded){
            activeDays++;
        }
        return;
    }
    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        double avgSteps = totalSteps / days;
        return avgSteps;
    }
}