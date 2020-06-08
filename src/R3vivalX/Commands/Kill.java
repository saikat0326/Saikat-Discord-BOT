package R3vivalX.Commands;

import java.util.Random;

import R3vivalX.Main.Eraser;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Kill extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		String args1[] = event.getMessage().getContentDisplay().split("\\s+");
		
		String member = "";
		member = event.getMember().getAsMention().toString();
		
		if(args[0].equalsIgnoreCase(Eraser.PREFIX + "kill")) {
			
			if(args.length < 2) {
				EmbedBuilder builder = new EmbedBuilder();
				builder.setTitle("Wrong Format !!!");
				builder.setDescription("~kill [Enter The Player's Name]");                          //TODO Diss
				builder.setColor(0x00ff00);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(builder.build()).queue();
				
			}
			
			else if(args[1].equalsIgnoreCase("saikat") || args[1].equalsIgnoreCase("eraserhead") || args1[1].equalsIgnoreCase("@Eraserhead")) {
				EmbedBuilder builder = new EmbedBuilder();
				builder.setDescription("You Cannot Kill The Developer");
				builder.setColor(0x00ff00);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(builder.build()).queue();
			}
			
			else {
				EmbedBuilder builder = new EmbedBuilder();
				builder.setDescription(killSentence(member, args[1]));
				builder.setColor(0x00ff00);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(builder.build()).queue();
			}
		}
		
	}
	
	public String killSentence(String Kills,String GetKilled) {
		String x[] = {
				Kills + " Gives A Headshot To " + GetKilled + " Using AWM, and " + GetKilled + " Died",
				Kills + " Threw A Stone On " + GetKilled + " And That Stone Hits " + GetKilled + "'s PP, He Died Due To Excess Bleeding",
				Kills + " Threw Some Poop On "+ GetKilled + "'s Face. He Died due To Suffocation",
				Kills + " Did Nothing !!! . " + GetKilled + "'s Balls Suddenly Fell Off, And He Died",
				Kills + " Tried To knife "+ GetKilled + " But " + GetKilled + " Dodged It And Punched "+ Kills + "'s Balls",
				Kills + " Tried To Headshot "+ GetKilled + " But "+ Kills + " Got Out Of Ammo "
		};
		
		Random generator = new Random();
		int y = generator.nextInt(x.length-1);
		
		return x[y];
	}

}
