package R3vivalX.Commands;

import R3vivalX.Main.Eraser;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Admin extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(Eraser.PREFIX + "admin")) {
			
			event.getMessage().delete().queue();
			EmbedBuilder builder = new EmbedBuilder();
			builder.setTitle("Info About Admin Of The Server :");
			builder.setDescription("Admin is @Dr.Gamer_Arko◥▶_◀◤#4311 ");                          //TODO Admin
			builder.addField("Instagram :" ,"@evil.satanist", false);
			builder.addField("YouTube :" ,"Dr.Gamer Arko", false);
			builder.setColor(0x00ff00);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(builder.build()).queue();
			
		}
	}

}
