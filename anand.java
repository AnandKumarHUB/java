class anand
{
public static void main(String[] agrs)
{
int flag=0,i,j,n=100,count=0;
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(i%j==0)
{
flag++;}
}
if(flag==2)
{
count++;
if(count%2!=0)
{
System.out.println(i);

}
}
}}
}

