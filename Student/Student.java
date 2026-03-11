public class Student {
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private static int objek;
    // private double average; 

    public Student(){ 
        name = ""; 
        address = ""; 
        age = 0; 
        objek ++;
    } 

    public Student(String n, String a, int ag){ 
        name = n; 
        address = a; 
        age = ag; 
        objek ++;
    } 

    public Student(int math, int english, int science){
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        objek ++;
    }

    public void setName(String n){
        name = n;
    } 

    public void setAddress(String a){ 
        address = a; 
    } 

    public void setAge(int ag){ 
        age = ag; 
    } 

    public void setMath(int math){ 
        mathGrade = math; 
    } 

    public void setEnglish(int english){ 
        englishGrade = english; 
    } 

    public void setScience(int science){ 
        scienceGrade = science; 
    } 

    private double getAverage(){ 
        double result = 0; 
        result = (mathGrade+scienceGrade+englishGrade)/3; 
    return result; 
    } 

    private boolean statusAkhir(){
        if(getAverage() >= 61){
            return true;
        }
        else return false;
    }

    public static void displayObjek(){
        System.out.println("Objek yang dibuat adalah " + objek);
    }

    public void displayMessage(){ 
        System.out.println("Siswa dengan nama " + name); 
        System.out.println("Beramalat di " + address); 
        System.out.println("Berumur " + age); 
        System.out.println("Mempunyai nilai rata rata " + getAverage()); 
        if(statusAkhir() == true){
            System.out.println("Status akhir lolos");
        }
        else{
            System.out.println("Status akhir remidi!");
        }
        System.out.println("");
    } 
}
