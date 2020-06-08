package R3vivalX.Commands;

import R3vivalX.Main.Eraser;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CICSE  extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(Eraser.PREFIX + "cicse")) {
			
			 event.getMessage().delete().queue();
		      EmbedBuilder builder = new EmbedBuilder();
		      builder.setTitle("Aaji L%@& Mera");
		      builder.setImage("https://media.giphy.com/media/Qx51oqbbdvLFKnG1ch/giphy.gif");              //TODO Remove The Word Anusha
		      builder.setColor(0xff0000);
		      
		      event.getChannel().sendTyping().queue();
			  event.getChannel().sendMessage(builder.build()).queue();
			
	}

   }
}
