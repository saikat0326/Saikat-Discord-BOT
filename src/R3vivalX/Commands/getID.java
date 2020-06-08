package R3vivalX.Commands;

import R3vivalX.Main.Eraser;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class getID extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		String m = "";
		m = event.getMember().getId().toString();
		String MEMBER = event.getMember().getEffectiveName();
		
		if (args[0].equalsIgnoreCase(Eraser.PREFIX + "getID")) {
			EmbedBuilder builder = new EmbedBuilder();
			builder.setTitle(MEMBER +" Your ID");
			builder.setDescription(m);                          //TODO Diss
			builder.setColor(0x00ff00);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(builder.build()).queue();
		}
	}

}
