package task1;

public class Operation extends Thread{
    String operationName;
    int operationTime;

    public Operation() {
    }

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public void run(){
        try{
            System.out.println(operationName+ " "+operationTime);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
