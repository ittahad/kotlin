
fun main(args: Array<String>)
{
    var mainView = View()   // Lets assume its the window of the app and its created here
}

class View : OnClickListener
{
    init {
        var btn1 = Button("Left")
        btn1.setOnClickListener(this)

        var btn2 = Button("Right")
        btn2.setOnClickListener(this)

        btn1.click() // Button1 is clicked
        btn2.click() // Button2 is clicked
    }

    override fun onClick(btn1: Button) {
        println("${btn1.button} is clickd")
    }
}

interface OnClickListener
{
    fun onClick(btn: Button)
}

class Button(var button: String)
{
    var clickListener: OnClickListener? = null

    fun setOnClickListener(action: OnClickListener) {
        this.clickListener = action
    }

    fun click()
    {
        clickListener?.onClick(this)
    }
}

