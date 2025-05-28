
//This is Handler Interface/Abstract Class
abstract class Approver{
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processLeaveRequest(int leaveDays);
}

//Approver concrete classes

class Supervisor extends Approver {
  @Override
  public void processLeaveRequest(int leaveDays) {
    if (leaveDays <= 3) {
      System.out.println("Supervisor approved the leave.");
    } else if (nextApprover != null) {
      nextApprover.processLeaveRequest(leaveDays);
    }
  }
}

class Manager extends Approver {
  @Override
  public void processLeaveRequest(int leaveDays) {
    if (leaveDays <= 7) {
      System.out.println("Manager approved the leave.");
    } else if (nextApprover != null) {
      nextApprover.processLeaveRequest(leaveDays);
    }
  }
}

class Director extends Approver {
  @Override
  public void processLeaveRequest(int leaveDays) {
    if (leaveDays <= 14) {
      System.out.println("Director approved the leave.");
    } else if (nextApprover != null) { // Pass on if not handled
      nextApprover.processLeaveRequest(leaveDays);
    } else {
      System.out.println("Director: Leave request denied. Too many days!");
    }
  }
}


//After some days if I want to add one more entity that can approve the code then i can just extends the Approver class

class HR extends Approver {
    @Override
    public void processLeaveRequest(int leaveDays) {
        if(leaveDays <= 19){
            System.out.println("HR: Approved the Leave. These long leaves can be approved only once in Year.");
        }else{
            System.out.println("HR: Leave request requires further discussion.");

        }
    }
}

//Client code
public class LeaveApprovalChain {
  public static void main(String[] args) {
    // Create handler instances
    Approver supervisor = new Supervisor();
    Approver manager = new Manager();
    Approver director = new Director();
    // Set up the chain: Supervisor -> Manager -> Director
    supervisor.setNextApprover(manager);
    manager.setNextApprover(director);
    // Process a leave request
    int leaveDays = 15;
    System.out.println("Employee requests " + leaveDays + " days of leave.");
    supervisor.processLeaveRequest(leaveDays);


    System.out.println("------------------After some Days new Approver can approve the leave is added(HR)---------------------------------");
    
    Approver hr = new HR();
    director.setNextApprover(hr);

    supervisor.processLeaveRequest(leaveDays);

  }
}