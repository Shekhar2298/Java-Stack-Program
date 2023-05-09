
import java.util.Scanner;

 class Stackprogram{
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of stack :");
        int size=sc.nextInt();
        int [] arr=new int[size];
      

        stack_value st = new stack_value();
        while(true){
        System.out.println("press 1 for push \n 2 for pop \n 3 for Display");
        int choice =sc.nextInt();
        switch(choice)
        {
            case 1:
            st.push(arr);
            break;
            case 2:
           st.pop(arr);
            break;
            case 3:
            st.Display(arr);
            default:
            System.out.println("Enter the valid choice");
       
}}}}
       
        class stack_value{
            int top=-1;
              void push(int [] arr){
                
                if(top==arr.length-1){
                    System.out.println("Stack is full");
                }else{
                System.out.println("enter the input number:");
                Scanner sc = new Scanner(System.in);
                  int input =sc.nextInt();
                     top +=1;
                     arr[top]=input;
                }
        }
        
        void pop(int []arr){
            if(top==-1)
            {System.out.println("Stack is Empty");}
            else{       
                
                arr[top]=0;
                top -=1;
                System.out.println("The element has been removed.");   
            }

        }
        void Display( int [] arr){
            if(top==-1){
                System.out.println("Stack is empty");
            }else{
                for(int i=0;i<=arr.length;i++)
                {
                    System.out.print(arr[i]+" ");
                }
            }return;
        }}