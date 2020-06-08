package R3vivalX.Commands;

import R3vivalX.Main.Eraser;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Developer extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(Eraser.PREFIX + "developer")) {
			
			event.getMessage().delete().queue();
			EmbedBuilder builder = new EmbedBuilder();
			builder.setTitle("Info About Developer :");
			builder.setDescription("Developer is @Eraserhead#8702 ");                             //TODO Developer
			builder.addField("Instagram :" ,"@saikat._", false);
			builder.addField("Facebook :" ,"saikat46", false);
			builder.addField("Gmail :" ,"shikhadas117@gmail.com", false);
			builder.setColor(0x00ff00);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(builder.build()).queue();
			
		}
	}

}
