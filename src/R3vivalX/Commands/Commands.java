package R3vivalX.Commands;

import R3vivalX.Main.Eraser;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		
		if(args[0].equalsIgnoreCase(Eraser.PREFIX + "cmds")) {
			
			event.getMessage().delete().queue();
			EmbedBuilder builder = new EmbedBuilder();
			builder.setTitle("System.out.println(\"Eraser\") [BOT] Commands :");
			builder.setDescription("Prefix : ~ ");
			builder.addField("~info :" ,"To Get Basic Info About \"The Official R3vivalX\"", false);              //TODO Commands
			builder.addField("~crush :" ,"To Know Who My Crush is", false);
			builder.addField("~developer :" ,"To Get Info About The Developer", false);
			builder.addField("~admin :" ,"To Get Info About Server Admin", false);
			builder.addField("~clear [No. Of Messages] :" ,"To Clear Certain Amount of Messages", false);
			builder.addField("~diss [Name] :" ,"To Diss Certain Person", false);
			builder.addField("~getID :" ,"To Get Your ID in R3vivalX Server", false);
			builder.addField("~kill [Name] :" ,"To Kill Certain Person", false);
			builder.addField("~say [Text] :" ,"To Order The BOT , to Say Something", false);
			builder.addField("~waifu :" ,"To Display @Eraserhead's Waifu", false);
			builder.setColor(0x00ff00);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(builder.build()).queue();
			
		}
		
		
	}
	
}
