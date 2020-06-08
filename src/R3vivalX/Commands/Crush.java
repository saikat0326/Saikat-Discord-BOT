package R3vivalX.Commands;


import R3vivalX.Main.Eraser;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Crush extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		
		if(args[0].equalsIgnoreCase(Eraser.PREFIX + "crush")) {
			
			event.getMessage().delete().queue();
			EmbedBuilder builder = new EmbedBuilder();
			builder.setTitle("EraserHead's Crush : ");
			builder.setDescription("Beautiful Morning At Sea Beach");
			builder.addField("Crush :" ,":heart_eyes: :sunrise:", false);                           //TODO Hint Others About My Crush
			builder.setColor(0x00ff00);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(builder.build()).queue();
			
		}
	}
}


