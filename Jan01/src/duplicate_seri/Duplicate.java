package duplicate_seri;



import java.util.*;

public class Duplicate 
{
	List<Integer> numberList;
	
	public Duplicate(List<Integer> numberList) {
		this.numberList=numberList;
	}

	public List<Integer> getNumberList() {
		return numberList;
	}

	public void setNumberList(List<Integer> numberList) {
		this.numberList = numberList;
	}

	public List<Integer> duplicate()
	{
		List<Integer> list=new ArrayList<Integer>();//1,2,3,1,2,3,4
		  for(int i=0; i<numberList.size(); i++) 
		  {
			  int count=0;
			  for(int j=i+1;j<numberList.size();j++)
			  {
				  if(numberList.get(i) == numberList.get(j)) {
					  if(!list.contains(numberList.get(i)))
					  count++;
				  }
			  }
			  if(count > 0) {
				  list.add(numberList.get(i));
			  }
			  
		  }
		  return list;
	}
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(4);
		Duplicate dup=new Duplicate(list);
		List<Integer> duplicate = dup.duplicate();
		
		System.out.println(duplicate);
	}
}
