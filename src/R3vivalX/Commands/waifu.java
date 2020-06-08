package R3vivalX.Commands;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

import R3vivalX.Main.Eraser;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class waifu extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		
		if(args[0].equalsIgnoreCase(Eraser.PREFIX + "waifu")) {
			// Upload and send an image to current channel
			try {
			    URL url = new URL("https://pm1.narvii.com/6563/5fa949a47a8a12b3e115ac89b2cd5f5e5acdb9bc_hq.jpg");
					BufferedImage img = ImageIO.read(url);
					File file = new File("temp.jpg"); // change the '.jpg' to whatever extension the image has
					ImageIO.write(img, "jpg", file); // again, change 'jpg' to the correct extension
					event.getChannel().sendFile(file).queue();
			}
			catch (Exception e) {
					event.getChannel().sendMessage("Error fetching image.").queue();
			}
		}
	
	}

}
