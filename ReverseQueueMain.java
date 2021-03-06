


import java.util.*;

public class ReverseQueueMain {

	public static void main(String[] args) {


		Scanner obj =new Scanner(System.in);
		
		int i,j,data,n,choice;
		
		
		System.out.println("Enter the elements in the queue");
		n = obj.nextInt();
		
		ReverseQueueDemo q = new ReverseQueueDemo(n);
		
		
		
		
		do{
			
			System.out.println("-----------");
			System.out.println("   Menu   ");
			System.out.println("1. insert");
			System.out.println("2. remove");
			System.out.println("3. check if empty");
			System.out.println("4. show");
			System.out.println("5. exit");
			System.out.println("-----------");
			System.out.println("Enter your choice");
			
			choice = obj.nextInt();
			
			switch(choice){
			
			case 1:
				System.out.println("Enter the data value to be inserted");
				data = obj.nextInt();
				
				q.insert(data);
				break;
			
				
		
			
			case 2:
				
				q.remove();
				break;
				
		
			
			case 3:
				boolean check = q.isEmpty();
				
				if(check)
					System.out.println("Queue is empty");
				else
					System.out.println("Queue is not empty");
				
				break;
				
			
			case 4:
				q.show();
				break;
				
			
			case 5:break;
			
			
			default:
				System.out.println("Illegal Operation, Try again");
			
			
			}
			
		}while(choice!=5);
		
	}

}





class ReverseQueueDemo{
	
	int front,rear,len;
	int dqarray[];
	
	public ReverseQueueDemo(int n) {
	
		len=n;
		
		front = n;
		rear = n-1;
		
		
		dqarray = new int[len];
		System.out.println("len : "+len);
	}
	
	public void insert(int data){
		
		if( (front == 0) )
			System.out.println("Queue is full");
		else{
			dqarray[--front] = data;
			System.out.println("front: "+front+"   rear:"+rear);
		}
			
	}

	

	public void remove(){
		
		if(isEmpty())
			System.out.println("Queue is empty");
		else{
			rear--;

			System.out.println("front: "+front+"   rear:"+rear);
		}
			
			
		
	}
	
	public boolean isEmpty(){
		
		if(front>rear)
			return true;
		else 
			return false;
		
		
	}
	
	public void show(){
		
		if(isEmpty())
			System.out.println("Queue is empty");
		
			for(int i=front;i<=rear;i++)
				System.out.print(dqarray[i]+" ");
			
			
	}
		
	
}
