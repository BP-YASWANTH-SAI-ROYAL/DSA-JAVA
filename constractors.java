 class Chaishop{
    String branchname;
    int pricepercup;

    public void Classfun(){
        System.out.println("I AM FUNCTION IN THE CLASS LOOPALA  BROO SEE YAA HERE.");
    }

} 

class Main {

    public static void fun(){
        System.out.println("I AM FUNCTION IN THE MAIN CLASS BROO SEE YAA HERE.");
    }
    public static void main(String[] args){

        fun();

   

    Chaishop branch1 = new Chaishop();
    branch1.branchname = "Royal Tea";
    branch1.pricepercup = 5;
    Chaishop branch2 = new Chaishop();
    branch2.branchname = "ROYAL KING";
    branch2.pricepercup = 100;
    System.out.println("Branch Name: " + branch1.branchname + ", Price per Cup: " + branch1.pricepercup);
    System.out.println("Branch Name: " + branch2.branchname + ", Price per Cup: " + branch2.pricepercup);
    branch1.Classfun();
    
    

}
}
