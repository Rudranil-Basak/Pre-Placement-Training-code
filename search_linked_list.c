#include<stdio.h>
#include<malloc.h>
void create_list(int data);
void display();
void search(int data1);
struct node{
	int info;
	struct node *next;// stores the address of the next node
	};
struct node *list,*p,*q;
int flag=0;
void create_list(int data)
{
	;
	p=(struct node *)malloc(sizeof(struct node));
	p->info=data;
	p->next=NULL;
	if(list==NULL)//list is empty
	{
		list=p;
	}
	else
	{
		q=list;
		while(q->next!=NULL)
		{
			q=q->next;
		}
		q->next=p;
	}
}
void display()
{
	q=list;
	while(q!=NULL)
	{
		printf("%d ->",q->info);
		q=q->next;
	}
}
void search(int data1)
{
	q=list;
	while(q!=NULL)
	{
		if(q->info==data1)
		{
		
		flag=1;
		break;
	}
		q=q->next;
	}
	if(flag==1)
	printf("ELement found");
	else
	printf("ELement not found");
}
void main()
{
int i,n,data4,s;
	list=NULL;
	printf("Enter the no. of elements:");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		printf("Enter value:");
		scanf("%d",&data4);
		create_list(data4);
	}
	display();
	printf("enter the number to be searched:");
	scanf("%d",&s);
	search(s);
}
