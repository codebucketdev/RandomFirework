package de.codebucket.randomfirework;

import java.util.Random;


import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.FireworkEffect.Builder;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;



//TODO List:
// + More Random
public class RandomFireworkAPI
{
	RandomFirework plugin;

	private static Random random = new Random();
	
	public RandomFireworkAPI(RandomFirework plugin)
	{
		this.plugin = plugin;
	}
	
	public static void spawnRandomFirework(Location spawnlocation, boolean rgb)
	{
		//Spawn the Firework, get the FireworkMeta.		
        Firework fw = (Firework) spawnlocation.getWorld().spawnEntity(spawnlocation, EntityType.FIREWORK);
        FireworkMeta meta = fw.getFireworkMeta();
        Builder effect = FireworkEffect.builder();
        
        //Choose Random a Type...
        Type[] effects = FireworkEffect.Type.values();
        int typeid = random.nextInt(effects.length);
        Type type = effects[typeid];
        effect.with(type);
        
        for(int i = 0; i < 5; i++) 
		{
        	effect.withColor(getRandomColor(rgb));
		}
        
        int flicker = random.nextInt(2);
        if(flicker == 1)
        {
        	effect.withFlicker();
        }
        
        int trail = random.nextInt(2);
        if(trail == 1)
        {
        	effect.withTrail();
        }
        
        int fade = random.nextInt(2);
        if(fade == 1)
        {
        	for(int i = 0; i < 3; i++) 
    		{
            	effect.withFade(getRandomColor(rgb));
    		}
        }
        
        meta.addEffect(effect.build());
        
        int power = random.nextInt(5) + 1;
        meta.setPower(power);
        
        fw.setFireworkMeta(meta);
	}
	
	public static ItemStack getRandomItemStack(boolean rgb)
	{
		ItemStack fw = new ItemStack(Material.FIREWORK);
		FireworkMeta meta = (FireworkMeta)fw.getItemMeta();
        Builder effect = FireworkEffect.builder();
        
        //Choose Random a Type...
        Type[] effects = FireworkEffect.Type.values();
        int typeid = random.nextInt(effects.length);
        Type type = effects[typeid];
        effect.with(type);
        
        for(int i = 0; i < 5; i++) 
		{
        	effect.withColor(getRandomColor(rgb));
		}
        
        int flicker = random.nextInt(2);
        if(flicker == 1)
        {
        	effect.withFlicker();
        }
        
        int trail = random.nextInt(2);
        if(trail == 1)
        {
        	effect.withTrail();
        }
        
        int fade = random.nextInt(2);
        if(fade == 1)
        {
        	for(int i = 0; i < 3; i++) 
    		{
            	effect.withFade(getRandomColor(rgb));
    		}
        }
        
        meta.addEffect(effect.build());
        
        int power = random.nextInt(5) + 1;
        meta.setPower(power);
        
        fw.setItemMeta(meta);
        
		return fw;
	}
	
	public static FireworkMeta getRandomItemMeta(boolean rgb)
	{
		ItemStack fw = new ItemStack(Material.FIREWORK);
		FireworkMeta meta = (FireworkMeta)fw.getItemMeta();
        Builder effect = FireworkEffect.builder();
        
        //Choose Random a Type...
        Type[] effects = FireworkEffect.Type.values();
        int typeid = random.nextInt(effects.length);
        Type type = effects[typeid];
        effect.with(type);
        
        for(int i = 0; i < 5; i++) 
		{
        	effect.withColor(getRandomColor(rgb));
		}
        
        int flicker = random.nextInt(2);
        if(flicker == 1)
        {
        	effect.withFlicker();
        }
        
        int trail = random.nextInt(2);
        if(trail == 1)
        {
        	effect.withTrail();
        }
        
        int fade = random.nextInt(2);
        if(fade == 1)
        {
        	for(int i = 0; i < 3; i++) 
    		{
            	effect.withFade(getRandomColor(rgb));
    		}
        }
        
        meta.addEffect(effect.build());
        
        int power = random.nextInt(5) + 1;
        meta.setPower(power);
        
		return meta;
	}
	
	public static FireworkEffect getRandomFireworkEffect(boolean rgb)
	{
        Builder effect = FireworkEffect.builder();
        
        //Choose Random a Type...
        Type[] effects = FireworkEffect.Type.values();
        int typeid = random.nextInt(effects.length);
        Type type = effects[typeid];
        effect.with(type);
        
        for(int i = 0; i < 5; i++) 
		{
        	effect.withColor(getRandomColor(rgb));
		}
        
        int flicker = random.nextInt(2);
        if(flicker == 1)
        {
        	effect.withFlicker();
        }
        
        int trail = random.nextInt(2);
        if(trail == 1)
        {
        	effect.withTrail();
        }
        
        int fade = random.nextInt(2);
        if(fade == 1)
        {
        	for(int i = 0; i < 3; i++) 
    		{
            	effect.withFade(getRandomColor(rgb));
    		}
        }
        
		return effect.build();
	}
	
	public static void spawnRandomFirework(Location spawnlocation, FireworkEffect.Type type, boolean rgb)
	{
		//Spawn the Firework, get the FireworkMeta.		
        Firework fw = (Firework) spawnlocation.getWorld().spawnEntity(spawnlocation, EntityType.FIREWORK);
        FireworkMeta meta = fw.getFireworkMeta();
        Builder effect = FireworkEffect.builder();
        
        effect.with(type);
        
        for(int i = 0; i < 3; i++) 
		{
        	effect.withColor(getRandomColor(rgb));
		}
        
        meta.addEffect(effect.build());
        
        int power = random.nextInt(5) + 1;
        meta.setPower(power);
        
        fw.setFireworkMeta(meta);
	}
	
	public static ItemStack getRandomItemStack(FireworkEffect.Type type, boolean rgb)
	{
		ItemStack fw = new ItemStack(Material.FIREWORK);
		FireworkMeta meta = (FireworkMeta)fw.getItemMeta();
        Builder effect = FireworkEffect.builder();
        
        effect.with(type);
        
        for(int i = 0; i < 3; i++) 
		{
        	effect.withColor(getRandomColor(rgb));
		}
        
        meta.addEffect(effect.build());
        
        int power = random.nextInt(5) + 1;
        meta.setPower(power);
        
        fw.setItemMeta(meta);
        
		return fw;
	}
	
	public static FireworkMeta getRandomItemMeta(FireworkEffect.Type type, boolean rgb)
	{
		ItemStack fw = new ItemStack(Material.FIREWORK);
		FireworkMeta meta = (FireworkMeta)fw.getItemMeta();
        Builder effect = FireworkEffect.builder();
        
        effect.with(type);
        
        for(int i = 0; i < 3; i++) 
		{
        	effect.withColor(getRandomColor(rgb));
		}
        
        meta.addEffect(effect.build());
        
        int power = random.nextInt(5) + 1;
        meta.setPower(power);
        
		return meta;
	}
	
	public static FireworkEffect getRandomFireworkEffect(FireworkEffect.Type type, boolean rgb)
	{
        Builder effect = FireworkEffect.builder();
        
        effect.with(type);
        
        for(int i = 0; i < 3; i++) 
		{
        	effect.withColor(getRandomColor(rgb));
		}
        
		return effect.build();
	}
	
	public static void spawnRandomFirework(Location spawnlocation, FireworkEffect.Type type, int color, boolean rgb)
	{
		//Spawn the Firework, get the FireworkMeta.		
        Firework fw = (Firework) spawnlocation.getWorld().spawnEntity(spawnlocation, EntityType.FIREWORK);
        FireworkMeta meta = fw.getFireworkMeta();
        Builder effect = FireworkEffect.builder();
        
        effect.with(type);
        
        for(int i = 0; i < color; i++) 
		{
        	effect.withColor(getRandomColor(rgb));
		}
        
        meta.addEffect(effect.build());
        
        int power = random.nextInt(5) + 1;
        meta.setPower(power);
        
        fw.setFireworkMeta(meta);
	}
	
	public static ItemStack getRandomItemStack(FireworkEffect.Type type, int color, boolean rgb)
	{
		ItemStack fw = new ItemStack(Material.FIREWORK);
		FireworkMeta meta = (FireworkMeta)fw.getItemMeta();
        Builder effect = FireworkEffect.builder();
        
        effect.with(type);
        
        for(int i = 0; i < color; i++) 
		{
        	effect.withColor(getRandomColor(rgb));
		}
        
        meta.addEffect(effect.build());
        
        int power = random.nextInt(5) + 1;
        meta.setPower(power);
        
        fw.setItemMeta(meta);
        
		return fw;
	}
	
	public static FireworkMeta getRandomItemMeta(FireworkEffect.Type type, int color, boolean rgb)
	{
		ItemStack fw = new ItemStack(Material.FIREWORK);
		FireworkMeta meta = (FireworkMeta)fw.getItemMeta();
        Builder effect = FireworkEffect.builder();
        
        effect.with(type);
        
        for(int i = 0; i < color; i++) 
		{
        	effect.withColor(getRandomColor(rgb));
		}
        
        meta.addEffect(effect.build());
        
        int power = random.nextInt(5) + 1;
        meta.setPower(power);
        
		return meta;
	}
	
	public static FireworkEffect getRandomFireworkEffect(FireworkEffect.Type type, int color, boolean rgb)
	{
        Builder effect = FireworkEffect.builder();
        
        effect.with(type);
        
        for(int i = 0; i < color; i++) 
		{
        	effect.withColor(getRandomColor(rgb));
		}
        
		return effect.build();
	}
	
	private static Color getRandomColor(boolean rgb)
	{
		if(rgb == true)
		{
			return Color.fromRGB(random.nextInt(256), random.nextInt(256), random.nextInt(256));
		}
		else
		{
			return getRandomDyeColor();
		}
	}
	
	private static Color getRandomDyeColor()
	{
		DyeColor[] dyecolor = DyeColor.values();
		int colorid = random.nextInt(dyecolor.length);
		Color color = dyecolor[colorid].getFireworkColor();
		return color;
	}
}
