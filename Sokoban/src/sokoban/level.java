/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

/**
 *
 * @author jordanadkins
 */
public class level {
    String sLevel;
    int lvl=1;
    
    public int getintLevel(){
        return lvl;
    }
    public String getlevel() {
        return sLevel;
    }
    
    public void setLevel(int level){
        lvl = level;
        setsLevel();
    }
    
    private void setsLevel(){
        if (lvl == 1){
            sLevel =   "    ######\n"
            + "    ##   #\n"
            + "    ##$  #\n"
            + "  ####  $##\n"
            + "  ##  $ $ #\n"
            + "#### # ## #   ######\n"
            + "##   # ## #####  ..#\n"
            + "## $  $          ..#\n"
            + "###### ### #@##  ..#\n"
            + "    ##     #########\n"
            + "    ########\n";
        }
        if (lvl == 2){
            sLevel =    
"    #######\n" +
"    #  .  #\n" +
"    # #.# #\n" +
"    # $ $ #\n" +
"    #. $ ##\n" +
"    #  # #\n" +
"##### ## #####\n" +
"#  .  ## ##  #\n" +
"# #.# ##   $ #\n" +
"#   $ ##     #\n" +
"#.$$ #### .###\n" +
"#  # ## #$ #\n" +
"####  ### .#\n" +
"   ##.###.##\n" +
"    # #  .#\n" +
"    # $$ @#\n" +
"    #  $  #\n" +
"    #  #  #\n" +
"    #  ####\n" +
"    ####\n";
        }
        
      if (lvl ==3){
          sLevel = 
"      #####\n" +
"      #   ##\n" +
"    ###    #\n" +
"    #. #$$ #\n" +
"    #     ##\n" +
"    #.  $##\n" +
"######.   #####\n" +
"# ..## ## #  .#\n" +
"# $    ## $ # #\n" +
"#  #$# ## *$  #\n" +
"#   .$ ## .#  #\n" +
"##### ###    ##\n" +
"    # # #   ##\n" +
"    # ### ###\n" +
"    #.  @.#\n" +
"    #  $# ##\n" +
"    # # $. #\n" +
"    #   $# #\n" +
"    ####   #\n" +
"       #####\n";
      }  
      if (lvl == 4){
          sLevel = 
"    #######\n" +
"    #. .###\n" +
"    #.#$$ #\n" +
"    #     #\n" +
"    # $#  #\n" +
"    ##   ##\n" +
"#####  # #\n" +
"#.  # ## ######\n" +
"# #   ##.   . #\n" +
"# . # ## # #  #\n" +
"# $ $ ## $  $.#\n" +
"#   # ###### $#\n" +
"##  #  #   #  #\n" +
" ####  ########\n" +
"    # .*   #\n" +
"    ##$    #\n" +
"     # #$###\n" +
"     #. @#\n" +
"     #####";              
      }  
        
     if (lvl == 5){
         sLevel = 
"    #####\n" +
"    #   ###\n" +
"   ## .   #\n" +
"   #. $.$ #\n" +
"   ##$# ###\n" +
"    #   #\n" +
" #### # ##\n" +
"##    #  ##\n" +
"# $# ###  ####\n" +
"# .  ##..$  .#\n" +
"# *   # #$ $ #\n" +
"## #$ #   #  #\n" +
" #.  ### ##  #\n" +
" ###  ## #####\n" +
"   ##  .@##\n" +
"    #   $.#\n" +
"    ###*# #\n" +
"   ##     #\n" +
"   #  $  ##\n" +
"   #   ##\n" +
"   #####";
     }   
     
     if (lvl == 6){
         sLevel = 
"     ####\n" +
"    #  ###\n" +
"  ### $  #\n" +
"  #. .$$ #\n" +
"  #### .##\n" +
"    ##  #\n" +
"    #   #\n" +
"##### # #####\n" +
"#.    #     #\n" +
"# # ##### #.#\n" +
"# *$  ###  .#\n" +
"#  $. #  $$ #\n" +
"#   # #  .$ #\n" +
"##### # #####\n" +
"   #   @#\n" +
"   # $# ###\n" +
"   # * $  #\n" +
"   #   ## #\n" +
"   ##.  . #\n" +
"    ##   ##\n" +
"     #####";
     }
        if (lvl == 7){
            sLevel =
"    ######\n" +
"    # .  #\n" +
"   ##$   #\n" +
"   # $ # #\n" +
"  ## #$  #\n" +
"  # ..  ##\n" +
"### ### ##\n" +
"##  ##   #\n" +
"#  .## # ####\n" +
"#.  .#.  #  #\n" +
"# $  ##  #  #\n" +
"#$$####  $$ #\n" +
"#   ##   . ##\n" +
"### ## #####\n" +
"  # . .  #\n" +
"  # $.#$@#\n" +
"  ###   ##\n" +
"    #    #\n" +
"    ###$ #\n" +
"      #  #\n" +
"      ####";
        }
        
        
        
        
        
    }
}
