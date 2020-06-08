package R3vivalX.Commands;

import R3vivalX.Main.Eraser;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class info extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		
		if(args[0].equalsIgnoreCase(Eraser.PREFIX + "info")) {
			event.getMessage().delete().queue();
			EmbedBuilder builder = new EmbedBuilder();
			builder.setTitle("Official Website");
			builder.setDescription("https://bit.ly/R3vivalX");
			builder.addField("Official Instagram :" ,"@r3vivalx", false);                             //TODO Information About Server
			builder.setColor(0x00ff00);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(builder.build()).queue();
		}
		
	}

}
