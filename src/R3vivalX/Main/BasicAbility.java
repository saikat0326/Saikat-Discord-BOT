package R3vivalX.Main;


import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BasicAbility extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		String args1[] = event.getMessage().getContentDisplay().split("\\s+");
		
		for(int i = 0 ; i < args.length ; i++){
			if(args[i].equalsIgnoreCase("ornoob")) {
				EmbedBuilder builder = new EmbedBuilder();
				builder.setTitle("Lmao ORNOOB");
				builder.setDescription("You Won't Get Mini14 ");
				builder.addField(" " ,":face_with_hand_over_mouth:", false);                     //TODO Ornoob
				builder.setColor(0x00ff00);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(builder.build()).queue();
			}
		}
		
		for(int i = 0 ; i < args.length ; i++){
			if(args[i].equalsIgnoreCase("noob")) {
				EmbedBuilder builder = new EmbedBuilder();
				builder.setTitle(":middle_finger: :middle_finger:");
				builder.setDescription("No, Your Are Noob");
				builder.setColor(0x00ff00);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(builder.build()).queue();
			}
		}
		
	}

}
