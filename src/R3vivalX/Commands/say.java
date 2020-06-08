package R3vivalX.Commands;

import R3vivalX.Main.Eraser;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class say extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		
		if(args[0].equalsIgnoreCase(Eraser.PREFIX + "say")) {
			event.getMessage().delete().queue();
			
			event.getChannel().sendTyping().queue();
			int i = args.length;
			String say = "";
			for(int j = 1 ; j < i ; j++) {
				say = say + " " + args[j];
			}
			
			EmbedBuilder builder = new EmbedBuilder();
			builder.setTitle("I was Ordered To Say This :");                                   //TODO Say Something
			builder.setDescription(say);
			builder.setColor(0x00ff00);
			
			event.getChannel().sendMessage(builder.build()).queue();
		}
	}

}
