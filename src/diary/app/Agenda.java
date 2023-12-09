package diary.app;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Agenda <T>{
	List<Entry> entries;
	int size = 0;
	
	public Agenda(){
		entries = new ArrayList<Entry>();
	}
	
	public void addEntry(String entryName) {
		System.out.println("Type the entry name");
		Scanner scan = new Scanner(System.in);
		entries.add(size, new Entry());
		entries.get(size).setName(scan.nextLine());	
		size++;
	}
	
	public void removeEntry(int entryIndex) {
		System.out.print("Type the number of the entry you wish to remove: ");
		entries.remove(entryIndex);
	}
	
	public void showEntries() {
		for(Entry entry: entries) {
			System.out.println((entries.indexOf(entry) + 1) + " - " + entry);
		}
	}
}
