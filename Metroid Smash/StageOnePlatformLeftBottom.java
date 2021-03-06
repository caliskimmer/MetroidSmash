 import java.util.ArrayList;
 import java.awt.*;
 import javax.swing.*;

 public class StageOnePlatformLeftBottom extends LevelObject
   {
   private ArrayList< Image > platformFrames;
   private ArrayList< ImageIcon > platformFrameIcons;
   private Rectangle stageOnePlatformLeftBottom;
   private int collisionJumpCounter;
   private boolean isTouchingSurfaceObject;
   
   public StageOnePlatformLeftBottom( int objectX, int objectY )
      {
      super( objectX, objectY );
      platformFrames = new ArrayList< Image >();
      platformFrameIcons = new ArrayList< ImageIcon >();
      this.loadStates( this.createStates(
                        "Stage_One_Level_Object_Platform_Left_Bottom.png" ),
                        platformFrames,
                        platformFrameIcons );
                        
      stageOnePlatformLeftBottom = new Rectangle( this.getX(), this.getY(),
                                                  this.getStates().get( 0 ).getWidth( null ),
                                                  this.getStates().get( 0 ).getHeight( null ) );
                                                      
      collisionJumpCounter = 0;
      isTouchingSurfaceObject = true;
      } //end StageOneGround()
      
   public ArrayList< Image > getStates()
      {
      return platformFrames;
      } //end getStates()
      
   public int getStateValue()
      {
      return this.getStates().size();
      } //end int
      
   public Rectangle getObjectRectangle()
      {
      return stageOnePlatformLeftBottom;
      } //end getObjectRectangle()
      
   public void setCollisionJumpControl( int cjc )
      {
      collisionJumpCounter = cjc;
      } //end setCollisionJumpCounter()
      
   public int getCollisionJumpControl()
      {
      return collisionJumpCounter;
      } //end getcollisionJumpCounter()
      
   public void setIsTouchingSurfaceObject( boolean itso )
      {
      isTouchingSurfaceObject = itso;
      } //end setIsTouchingSurfaceObject()
      
   public boolean getIsTouchingSurfaceObject()
      {
      return isTouchingSurfaceObject;
      } //end getIsTouchingSurfaceObject();
   } //end StageOnePlatformLeft