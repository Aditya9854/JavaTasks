class VideoFile
{
    void play()
    {
        System.out.println("Opening generic file.");
    }
}
class MP4 extends VideoFile
{
    void play()
    {
        System.out.println("Playing Mp4 type..");
    }
}
class MKV extends VideoFile
{
    void play()
    {
        System.out.println("Playing mkv type...");
    }
}
public class Runtime 
{
    public static void main(String[]a)
    {
        //Upcasting
        //Reference of parent ..obj of child
        VideoFile vObj;

        vObj = new MP4();
        //Dynamic Dispatch --calls mp4 version
        vObj.play(); 

        vObj = new MKV();
        //Dynamic Dispatch --calls mkv version
        vObj.play();
        
    }
}
