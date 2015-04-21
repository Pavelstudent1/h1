package lesson150421.patterns.bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {
	
	List<Member> members = new ArrayList<Member>();
	
	public void addMember(final Member member){
		members.add(member);
	}
	
	public void removeMember(final Member member){
		members.remove(member);
	}

	public void broadcast(final Command command) {
		for (Member member : members) {
			member.accept(command);
		}
	}
	
}
