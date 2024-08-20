import java.util.Scanner;
class LinkList
{
	Node head=null;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkList ls=new LinkList();
		int ch,x,loc;

		do
		{
			System.out.println();
			System.out.println("*********** LinkList ***********");
			System.out.println("Press 1 For Insert First Node");
			System.out.println("Press 2 For Insert Last Node");
			System.out.println("Press 3 For Insert between Node");
			System.out.println("Press 4 For Delete First Node");
			System.out.println("Press 5 For Delete between Node");
			System.out.println("Press 6 For Delete Last Node");
			System.out.println("Press 7 For Update between Node");
			System.out.println("Press 8 For Search Node");
			System.out.println("Press 9 For Display Node");
			System.out.println("Press 0 For Exi!");
			System.out.println("************** END **************");
			System.out.println();

			System.out.print("Enter Choice : ");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.print("Enter Value : ");
					x=sc.nextInt();
					ls=insert_first(ls,x);
					display(ls);
					break;
				case 2:
					System.out.print("Enter Value : ");
					x=sc.nextInt();
					ls=insert_last(ls,x);
					display(ls);
					break; 
				case 3:
					System.out.print("Enter Position : ");
					loc=sc.nextInt();
					System.out.print("Enter Value : ");
					x=sc.nextInt();
					ls=insert_between(ls,x,loc);
					display(ls);
					break; 
				case 4:
					ls=delete_first(ls);
					display(ls);
					break;
				case 5:
					System.out.print("Enter Location for Delete Node : ");
					loc=sc.nextInt();
					ls=delete_Between(ls,loc);
					display(ls);
					break;
				case 6:
					ls=delete_last(ls);
					display(ls);
					break;
				case 7:
					System.out.print("Enter Location for Update Node : ");
					loc=sc.nextInt();
					System.out.print("Enter Value : ");
					x=sc.nextInt();
					ls=update_Between(ls,loc,x);
					display(ls);
					break;
				case 8:
					System.out.print("Enter Value to be Searched : ");
					x=sc.nextInt();
					search_node(ls,x);
					display(ls);
					break;
				case 9:
					display(ls);
					break;
				case 0:
					break;
				default:
					System.out.println("Wrong choise!");
			}
		}while(ch!=0);
	}
	public static LinkList insert_first(LinkList ls,int x)
	{
		Node node=new Node(x);
		node.next=ls.head;
		ls.head=node;
		return ls;
	}
	public static LinkList insert_last(LinkList ls,int x)
	{
		Node node=new Node(x);
		if(ls.head==null)
		{
			ls.head=node;
		}
		else
		{
			Node temp=ls.head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
		return ls;
	}
	public static LinkList insert_between(LinkList ls,int x,int loc)
	{
		Node node=new Node(x);
		if(loc==1)
		{
			node.next=ls.head;
			ls.head=node;
			return ls;
		}
		else
		{
			Node temp=ls.head;
			int i=1;
			while(temp!=null)
			{
				if(i==loc-1)
				{
					node.next=temp.next;
					temp.next=node;
					return ls;
				}
				i++;
				temp=temp.next;
			}
			System.out.println("Location not found!");
			return ls;
		}
	}
	public static LinkList delete_Between(LinkList ls,int loc)
	{
		Node curr=ls.head;
		Node temp=null;
		if(ls.head==null)
		{
			System.out.println("LinkList is Empty!");
			return ls;
		}
		else
		{
			if(loc==1)
			{
				ls.head=curr.next;
				curr.next=null;
				System.out.println("Node Delete Successfully!");
				return ls;
			}
			else
			{
				int i=1;
				while(curr.next!=null)
				{
					if(i==loc-1)
					{
						temp=curr.next;
						curr.next=temp.next;
						temp=null;
						System.out.println("Node Delete Successfully!");
						return ls;
					}
					else
					{
						curr=curr.next;
						i++;
					}
				}
				System.out.println("Position Not Found!");
				return ls;	
			}
		}
	}
	public static LinkList delete_first(LinkList ls)
	{
		Node curr=ls.head;
		Node temp=null;
		if(ls.head==null)
		{
			System.out.println("LinkList is Empty!");
			return ls;
		}
		else
		{
			ls.head=curr.next;
			curr.next=null;
			System.out.println("Node Delete Successfully!");
			return ls;	
		}
	}
	public static LinkList delete_last(LinkList ls)
	{
		Node curr=ls.head,temp=null;
		if(ls.head==null)
		{
			System.out.println("List Underflow");
			return ls;
		}
		if(ls.head.next==null)
		{
			ls.head=null;
			return ls;
		}
		else
		{
			while(curr.next.next!=null)
			{
				curr=curr.next;
			}
			curr.next=null;
			return ls;
		}
	}
	public static LinkList update_Between(LinkList ls,int loc,int x)
	{
		if(ls.head==null)
		{
			System.out.println("LinkList is Empty!");
			return ls;
		}
		else
		{
			Node curr=ls.head;
			if(loc==1)
			{
				curr.data=x;
				System.out.println("Node Update Successfully!");
				return ls;
			}
			else
			{
				int i=1;
				while(curr!=null)
				{
					if(loc==i)
					{
						curr.data=x;
						System.out.println("Node Update Successfully!");
						return ls;
					}
					else
					{
						curr=curr.next;
					}
					i++;
				}
				System.out.println("Position Not Found!");
			}
		}
		return ls;
	}
	public static void search_node(LinkList ls,int x)
	{
		Node curr=ls.head;
		int i=1;;
		while(curr!=null)
		{
			if(curr.data==x)
			{
				System.out.println("Key Found At Location : "+i);
				return;
			}
			else
			{
				curr=curr.next;
				i++;
			}
		}
		System.out.println("Value not Found!");
	}
	public static void display(LinkList ls)
	{
		Node temp=ls.head;
		System.out.println();
		System.out.println(" :: LinkList :: ");
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp=temp.next;
		}
		System.out.println();
	}
}