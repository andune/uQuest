package hawox.uquest.interfaceevents;

import hawox.uquest.Quester;

import org.bukkit.entity.Player;

public class QuestDropEvent extends UQuestEvent{
	Player player;
	Quester quester;
	int questId;
	
	
	public QuestDropEvent(Player p, Quester q, int id){
//		super("QuestGetEvent");
		this.player = p;
		this.quester = q;
		this.questId = id;
	}
	
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Quester getQuester() {
		return quester;
	}
	public void setQuester(Quester quester) {
		this.quester = quester;
	}
	public int getQuestId() {
		return questId;
	}
	public void setQuestId(int questId) {
		this.questId = questId;
	}
}