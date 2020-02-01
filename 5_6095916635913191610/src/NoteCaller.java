import java.util.ArrayList;

public class NoteCaller {

	public static void main(String[] args) {

		// Create Note Object to show data
		Note note = new Note();
		note.setId(1);
		note.setTitle("Noted1");
		note.setDesc("Descriptio1");
//		note.addData();
		Note note1 = new Note(1, "Noted1", "Description1");
		note.addNoteData(note1);
		
		note.setId(2);
		note.setTitle("Noted2");
		note.setDesc("Description2");
//		note.addData();
		Note note2 = new Note(2, "Noted2", "Description2");
		note.addNoteData(note2);

		note.setId(3);
		note.setTitle("Noted3");
		note.setDesc("Description3");
//		note.addData();
		Note note3 = new Note(3, "Noted3", "Description3");
		note.addNoteData(note3);
		
//		note.displayData();
		note.displayNoteData();
	}

}

class Note {
	
	private int id;
	private String title;
	private String desc;
//	private ArrayList<String> data = new ArrayList();
	private ArrayList<Note> noteData = new ArrayList();
	
	public Note() {}
	
	public Note(int id, String title, String desc) {
		this.id = id;
		this.title = title;
		this.desc = desc;
	}
	
	public void addNoteData(Note note) {
		noteData.add(note);
	}
	
//	public void addData() {
//		data.add("Ra ith [id=" + this.getId() + ", title1=" + this.getTitle() + ", desc=" + this.getDesc() + "]");
//	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDesc() {
		return desc;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

//	public void displayData() {
//		for(int i = 0; i < data.size(); i++) {
//			System.out.println(data.get(i));
//		}
//		System.out.println("");
//		System.out.println("");
//	}

	public void displayNoteData() {
		for(int i = 0; i < noteData.size(); i++) {
			Note notedDis = noteData.get(i); // new Note();
			System.out.println("Class Object = " + notedDis);
			System.out.println("id = " + notedDis.getId());
			System.out.println("title = " + notedDis.getTitle());
			System.out.println("desc = " + notedDis.getDesc());
		}
	}
	
}
