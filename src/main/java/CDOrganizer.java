import java.time.LocalDateTime;
import java.util.ArrayList;

public class CDOrganizer {
  private static ArrayList<Task> instances = new ArrayList<Task>();

  private String mDescription;
  private LocalDateTime mCreatedAt;
  private boolean mCompleted;
  private int mId;

  public CDOrganizer(String cdTitle, String cdArtist) {
    mDescription = description;
    mCreatedAt = LocalDateTime.now();
    mCompleted = false;
    // "this" is the curent object that we are constructing
    instances.add(this);
    mId = instances.size();
  }

  public String getDescription() {
    return mDescription;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }

  public int getId() {
    return mId;
  }

  public void completeTask() {
    mCompleted = true;
  }

  public static ArrayList<Task> all() {
    return instances;
  }

  public static Task find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      // System.out.println(e.getStackTrace);
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }
}