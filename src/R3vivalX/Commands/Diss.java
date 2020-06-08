package R3vivalX.Commands;

import java.util.Random;

import R3vivalX.Main.Eraser;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Diss extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		String args1[] = event.getMessage().getContentDisplay().split("\\s+");
		String member = event.getMember().getId().toString();
		
		if (args[0].equalsIgnoreCase(Eraser.PREFIX + "diss")) {
			
			
			
			if(args.length < 2) {
				EmbedBuilder builder = new EmbedBuilder();
				builder.setTitle("Wrong Format !!!");
				builder.setDescription("~diss [Enter The Player's Name]");                          //TODO Diss
				builder.setColor(0x00ff00);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(builder.build()).queue();
				
			}
			
			else if(args[1].equalsIgnoreCase("saikat") || args[1].equalsIgnoreCase("eraserhead") || args1[1].equalsIgnoreCase("@Eraserhead")) {
				EmbedBuilder builder = new EmbedBuilder();
				builder.setDescription("You Cannot Diss The Developer");
				builder.setColor(0x00ff00);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(builder.build()).queue();
			}
			else {	
			    EmbedBuilder builder = new EmbedBuilder();
			    builder.setDescription(dissDialogue(args[1]));
			    builder.setColor(0x00ff00);
			
			    event.getChannel().sendTyping().queue();
			    event.getChannel().sendMessage(builder.build()).queue();
			}
			
		}
	}
	
	public String dissDialogue(String s) {
		String x = "";
		
		switch(toGenerate(9)) {
			case 0 : x = s + ", You Piece Of Shit"; break;
			case 1 : x = s + " Got a Smol PP.."; break;
			case 2 : x = s +", Go Suck Your Own Dick"; break;
			case 3 : x = " My Balls Are More Pretty Than " + s + "'s Face"; break;
			case 4 : x = s +" Eat My Pubic Hairs"; break;
			case 5 : x = s +" Momma Like To Comb My Pubic Hairs"; break;
			case 6 : x = s +", Your Mouth is Filled With My Cum"; break;
			case 7 : x = "I Farted On "+ s + "'s Mouth"; break;
			case 8 : x = s +", Go Jerk Your 2cm Dick"; break;
			case 9 : x = s +"'s Momma Likes To Jerk My Dick"; break;
		}
		return x;
	}

	public static int toGenerate(int x) {
		Random generator = new Random();
		int y = generator.nextInt(x);
		
		return y ;
	}

}
