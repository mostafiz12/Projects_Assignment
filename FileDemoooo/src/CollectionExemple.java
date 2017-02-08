import java.util.*;


public class CollectionExemple {
	public static void main(String[] a)
	{
		List l=new LinkedList();
		l.add("hi");
		l.add("tumi");
		l.add("amar");
		l.add("amar");
		l.add("kmon");
		print(l);
		
		Set s=new HashSet();
		s.add("hi");
		s.add("tumi");
		s.add("amar");
		s.add("amar");
		s.add("kmon");
		print(s);
		
		SortedSet ss=new TreeSet();
		ss.add("hi");
	    ss.add("tumi");
		ss.add("amar");
		ss.add("amar");
		ss.add("kmon");
		print(ss);
		
		
		LinkedHashSet p=new LinkedHashSet();
		p.add("hi");
	    p.add("tumi");
		p.add("amar");
		p.add("amar");
		p.add("kmon");
		print(p);
		
		Map m=new HashMap();
		m.put("hi", "Blo");
		m.put("Hello","Roky");
		m.put("Hello","Roky");
		m.put("Man","Krio");
		print(m.keySet());
		print(m.values());
		
		
		SortedMap sm=new TreeMap();
		sm.put("gho", "Slo");
		sm.put("Jott","Foky");
		sm.put("Jott","Foky");
		sm.put("Key","Lrio");
		print(sm.keySet());
		print(sm.values());
		
		
	}

	
	public static void print(Collection c)
	{
		Iterator it=c.iterator();
		while(it.hasNext())
		{
			String str=(String) it.next();
			System.out.println(str+"  ");
		}
		
		System.out.println("");
	}
	
	
	
}
