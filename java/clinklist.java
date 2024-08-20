import java.io.*;
import java.util.*;

public class clinklist
{
	Node first;
	Node curr;
	Node temp;

	static class Node
	{
		int data;
		Node next;

		Node(int number)
		{
			data=number;
			next=null;
		}
	}

	public static clinklist insertnode(clinklist list,int data)
	{
		Node newnode=new Node(data);

		if(list.first==null)
		{
			list.first=newnode;
			list.first.next=newnode;
		}
		else
		{
			list.curr=list.first;
			while(list.curr.next!=list.first)
			{
				list.curr=list.curr.next;
			}
			list.curr.next=newnode;
			list.curr=list.curr.next;
			list.curr.next=list.first;
		}

		return list;
	}

	public static void display(clinklist list)
	{
		if(list.first==null)
		{
			System.out.println("Linklist is empty!");
			return;
		}
		list.curr=list.first;
		while(list.curr.next!=list.first)
		{
			System.out.print("["+ list.curr + "|" + list.curr.data + "|" + list.curr.next +"]--");
			list.curr=list.curr.next;
		}
		System.out.print("["+ list.curr + "|" + list.curr.data + "|" + list.curr.next +"]");
	}

	public static void deletenode(clinklist list)
	{
		if(list.first==null)
		{
			System.out.println("Linklist is empty!");
			return;
		}
		list.curr=list.first;
		while(list.curr.next!=list.first)
		{
			list.temp=list.curr;
			list.curr=list.curr.next;
		}
		list.curr=list.temp;
		list.curr.next=list.first;
		System.out.println("Last Node Successfully Deleted!");
	}

	public static void main(String args[])
	{
		Scanner o=new Scanner(System.in);
		clinklist list=new clinklist();
		int ch,num;

		do
		{
			System.out.println("");
			System.out.println("Press 1 for new node");
			System.out.println("Press 2 for delete node");
			System.out.println("Press 3 for display node");
			System.out.println("Press 0 for exit");
			System.out.println("");

			System.out.print("Enter your choise:");
			ch=o.nextInt();

			switch(ch)
			{
				case 1:
					System.out.print("Enter Value:");
					num=o.nextInt();
					list=insertnode(list, num);
					display(list);
					break;
				case 2:
					deletenode(list);
					display(list);
					break;
				case 3:
					display(list);
					break;
				case 0:
					break;
				default:
					System.out.println("Wrong choise!");
			}
		}while(ch!=0);
	}
}