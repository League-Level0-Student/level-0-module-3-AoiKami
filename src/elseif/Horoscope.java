package elseif; 
import javax.swing.JOptionPane; 
public class Horoscope {
public static void main (String[] args) {
	String Zodiac = JOptionPane.showInputDialog("What is your sign of the stars?");
		if(Zodiac.equalsIgnoreCase("Aries")){
			JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		}
		if(Zodiac.equalsIgnoreCase("Taurus")){
			JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		}
			if(Zodiac.equalsIgnoreCase("Gemini")){
				JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
			}
				if(Zodiac.equalsIgnoreCase("Cancer")){
					JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");
				}
					if(Zodiac.equalsIgnoreCase("Leo")){
						JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful.");
					}
						if(Zodiac.equalsIgnoreCase("Virgo")){
							JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical.");
						}
							if(Zodiac.equalsIgnoreCase("Libra")){
								JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice.");
							}
								if(Zodiac.equalsIgnoreCase("Scorpio")){
									JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");
								}	
								if(Zodiac.equalsIgnoreCase("Sagittarius")){
										JOptionPane.showMessageDialog(null, "Happy, absent minded, creative, adventurous.");
								}
										if(Zodiac.equalsIgnoreCase("Capricorn")){
										JOptionPane.showMessageDialog(null, "Timeless, driven, calculating, ambitious.");
										}	
										if(Zodiac.equalsIgnoreCase("Aquarius")){
												JOptionPane.showMessageDialog(null, "Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
										}
												if(Zodiac.equalsIgnoreCase("Pisces")){
													JOptionPane.showMessageDialog(null, "Likeable, energetic, passionate, sensitive.");
												}
}}
		
