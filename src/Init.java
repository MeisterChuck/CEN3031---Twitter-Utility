import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterAPIConfiguration;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.api.TweetsResources;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

import gui.MainFrame;

public class Init {
	
	public static void main(String[] args) throws TwitterException {
		MainFrame panel = new MainFrame();
		//TODO: Automatically load saved API and OAuth details
		panel.setVisible(true);
		panel.setResizable(false);
	}

}
