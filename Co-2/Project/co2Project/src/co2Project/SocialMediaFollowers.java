package co2Project;
import java.util.*;

public class SocialMediaFollowers {
	private Map<String, Set<String>> userFollowersMap;
	public SocialMediaFollowers() {
		userFollowersMap = new HashMap<>();
	}
	public void addFollower(String user, String follower) {
		Set<String> followers = userFollowersMap.getOrDefault(user,  new HashSet<>());
		followers.add(follower);
		userFollowersMap.put(user,  followers);
	}
	public void displayFollowers(String user) {
		Set<String> followers = userFollowersMap.get(user);
		if(followers == null || followers.isEmpty()) {
			System.out.println(user+ "has no followers.");
			
		}
		else {
			System.out.println("Followers of"+ user + ": "+ followers);
		}
	}
	public void displayCommonFollowers(String user1, String user2) {
		Set<String> followers1 = userFollowersMap.getOrDefault(user1, new HashSet<>());
		Set<String> followers2 = userFollowersMap.getOrDefault(user2, new HashSet<>());
		Set<String> commonFollowers = new HashSet<>(followers1);
		commonFollowers.retainAll(followers2);
		if(commonFollowers.isEmpty()) {
			System.out.println("No common followers between" + " " + user1 + " " + "and" + " " + user2 + ".");
			
		}
		else {
			System.out.println("Common followers of " + user1 + " " + "and" + " " + user2 + ": " + commonFollowers);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SocialMediaFollowers tracker = new SocialMediaFollowers();

        // Add followers to users
        tracker.addFollower("Alice", "Bob");
        tracker.addFollower("Alice", "Charlie");
        tracker.addFollower("Bob", "Alice");
        tracker.addFollower("Charlie", "Alice");

        // Display followers
        tracker.displayFollowers("Alice");
        tracker.displayFollowers("Bob");
        tracker.displayFollowers("Charlie");

        // Display common followers between two users
        tracker.displayCommonFollowers("Alice", "Bob");
        tracker.displayCommonFollowers("Alice", "Charlie");
	}

}
