package com.example.coilsampleapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.Coil
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.decode.SvgDecoder
import coil.load
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val items = listOf(
            Item("https://miro.medium.com/max/3000/1*MI686k5sDQrISBM6L8pf5A.jpeg", exampleText),
            Item("https://images.unsplash.com/photo-1575314858013-6a4eebce01dc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1177&q=80", exampleText2))

        viewPager.adapter = SimplePagerAdapter(items)
    }


    companion object {
        val exampleText =
            "Bacon ipsum dolor amet t-bone swine fatback cow chicken. Bresaola boudin sirloin filet mignon ham hock. Ball tip landjaeger filet mignon pork meatloaf cow spare ribs capicola burgdoggen chuck turkey boudin. Kielbasa t-bone turducken fatback jerky. Beef meatball hamburger kielbasa.\n" +
                    "\n" +
                    "Andouille pork beef alcatra pig tri-tip doner pork chop tail boudin bacon meatball hamburger. Chicken ribeye frankfurter, jowl tongue brisket ham hock spare ribs ball tip biltong beef ribs landjaeger shankle burgdoggen. Capicola ribeye cupim short loin buffalo ball tip shank leberkas cow landjaeger porchetta. Flank jowl venison, meatball kielbasa capicola jerky pork chop. Porchetta salami meatloaf kevin, boudin prosciutto alcatra turkey.\n" +
                    "\n" +
                    "Short loin bacon ham hock, tongue meatball salami corned beef brisket frankfurter pastrami. Pig alcatra picanha flank short loin meatloaf. Drumstick tail ribeye swine. Tail frankfurter tongue ground round drumstick. Tongue turducken tri-tip kevin ribeye, spare ribs ham bresaola.\n" +
                    "\n" +
                    "Brisket tenderloin ham hock salami ham t-bone chicken shankle pork loin. Hamburger salami kevin chicken, beef ribs pork loin capicola frankfurter swine landjaeger ground round shoulder porchetta. Meatloaf salami jerky tri-tip. Shoulder beef drumstick leberkas, t-bone buffalo swine kielbasa bacon prosciutto ground round pork belly."

        val exampleText2 =
            "Picanha venison shank, bacon t-bone flank meatball beef ribs boudin. Kielbasa tri-tip capicola ribeye boudin shoulder. Swine ham hock tenderloin pork chop picanha. Filet mignon turkey salami ribeye. Ribeye shoulder ball tip tri-tip, drumstick pork chop venison corned beef tenderloin. Landjaeger ball tip pork tenderloin hamburger jowl picanha boudin. Hamburger flank pork chop alcatra, porchetta meatball chuck filet mignon cow short loin tail pig buffalo.\n" +
                    "\n" +
                    "Does your lorem ipsum text long for something a little meatier? Give our generator a try… it’s tasty!"
    }
}