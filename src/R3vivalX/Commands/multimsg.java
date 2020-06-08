package R3vivalX.Commands;

import R3vivalX.Main.Eraser;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class multimsg extends  ListenerAdapter{
	
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		
		if(args[0].equalsIgnoreCase(Eraser.PREFIX + "multimsg")) {
							
					event.getChannel().sendTyping().queue();
					int z = args.length;
					String say = "";
					for(int j = 1 ; j < z ; j++) {
						say = say + " " + args[j];
						continue;
					}
					
					event.getChannel().sendMessage(say).queue();
					event.getChannel().sendMessage(" ").queue();		
				
			}
		}
		
		
	}


