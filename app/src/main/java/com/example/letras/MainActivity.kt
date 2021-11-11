package com.example.letras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buscarMusica()

        val botaoMusicaTraducao = findViewById<Button>(R.id.buttonLetraTraduzida)
        botaoMusicaTraducao.setOnClickListener {
            buscarMusicaTraducao()
        }

        val botaoMusiciaOriginal = findViewById<Button>(R.id.buttonLetraOriginal)
        botaoMusiciaOriginal.setOnClickListener {
            buscarMusica()
        }
    }

    fun buscarMusica(){
        val textViewTituloMusica = findViewById<TextView>(R.id.musica)
        textViewTituloMusica.text = TITULO_MUSICA

        val textViewArtista = findViewById<TextView>(R.id.artista)
        textViewArtista.text = ARTISTA

        val textViewMusica = findViewById<TextView>(R.id.letraMusica)
        textViewMusica.text = MUSICA_ORIGINAL
    }

    fun buscarMusicaTraducao(){
        val textViewTituloMusica = findViewById<TextView>(R.id.musica)
        textViewTituloMusica.text = TITULO_MUSICA_TRADUCAO

        val textViewArtista = findViewById<TextView>(R.id.artista)
        textViewArtista.text = ARTISTA

        val textViewMusica = findViewById<TextView>(R.id.letraMusica)
        textViewMusica.text = MUSICA_TRADUCAO
    }

    companion object {
        val ARTISTA = "Miley Cyrus"
        val TITULO_MUSICA = "The Climb"
        val TITULO_MUSICA_TRADUCAO = "A escalada"
        val MUSICA_TRADUCAO = "Eu estou quase vendo\n" +
                "O sonho que estou sonhando\n" +
                "Mas há uma voz dentro da minha cabeça\n" +
                "Dizendo: Você nunca vai chegar lá\n" +
                "\n" +
                "Cada passo que eu dou\n" +
                "Cada movimento que eu faço, parece\n" +
                "Perdido, sem direção\n" +
                "Minha fé está abalada\n" +
                "Mas eu, eu tenho que continuar tentando\n" +
                "Tenho que manter minha cabeça erguida\n" +
                "\n" +
                "Sempre vai existir outra montanha\n" +
                "Eu sempre vou querer movê-la\n" +
                "Sempre vai ser uma batalha difícil\n" +
                "Às vezes eu vou ter que perder\n" +
                "O importante não é o quão rápido eu vou chegar lá\n" +
                "O importante não é o que está esperando do outro lado\n" +
                "É a escalada\n" +
                "\n" +
                "As lutas que estou enfrentando\n" +
                "As chances que estou tendo\n" +
                "Às vezes podem me derrubar, mas\n" +
                "Não, eu não vou quebrar\n" +
                "Eu posso não saber disso\n" +
                "Mas estes são os momentos que\n" +
                "Eu vou mais me lembrar, sim\n" +
                "Só tenho que continuar\n" +
                "\n" +
                "E eu, eu tenho que ser forte\n" +
                "Apenas seguir em frente\n" +
                "Porque\n" +
                "\n" +
                "Sempre vai existir outra montanha\n" +
                "Eu sempre vou querer movê-la\n" +
                "Sempre vai ser uma batalha difícil\n" +
                "Às vezes eu vou ter que perder\n" +
                "O importante não é o quão rápido eu vou chegar lá\n" +
                "O importante não é o que está esperando do outro lado\n" +
                "É a escalada, sim\n" +
                "\n" +
                "Sempre vai existir outra montanha\n" +
                "Eu sempre vou querer movê-la\n" +
                "Sempre vai ser uma batalha difícil\n" +
                "Às vezes eu vou ter que perder\n" +
                "O importante não é o quão rápido eu vou chegar lá\n" +
                "O importante não é o que está esperando do outro lado\n" +
                "É a escalada, sim, sim\n" +
                "\n" +
                "Continue andando\n" +
                "Continue escalando\n" +
                "Mantenha a fé, querido\n" +
                "O mais importante, o mais importante é a escalada\n" +
                "Mantenha a fé\n" +
                "Mantenha a sua fé, oh-oh"
        val MUSICA_ORIGINAL = "I can almost see it\n" +
                "That dream I'm dreaming\n" +
                "But, there's a voice inside my head saying\n" +
                "You'll never reach it\n" +
                "Every step I'm taking\n" +
                "Every move I make feels\n" +
                "Lost with no direction\n" +
                "My faith is shaking\n" +
                "But I, I gotta keep trying\n" +
                "Gotta keep my head held high\n" +
                "There's always gonna be another mountain\n" +
                "I'm always gonna wanna make it move\n" +
                "Always gonna be an uphill battle\n" +
                "Sometimes I'm gonna have to lose\n" +
                "Ain't about how fast I get there\n" +
                "Ain't about what's waiting on the other side\n" +
                "It's the climb\n" +
                "The struggles I'm facing\n" +
                "The chances I'm taking\n" +
                "Sometimes might knock me down, but\n" +
                "No, I'm not breaking\n" +
                "I may not know it\n" +
                "But these are the moments, that\n" +
                "I'm gonna remember most, yeah\n" +
                "Just gotta keep going\n" +
                "And I, I gotta be strong\n" +
                "Just keep pushing on, 'cause\n" +
                "There's always gonna be another mountain\n" +
                "I'm always gonna wanna make it move\n" +
                "Always gonna be an uphill battle\n" +
                "Sometimes I'm gonna have to lose\n" +
                "Ain't about how fast I get there\n" +
                "Ain't about what's waiting on the other side\n" +
                "It's the climb\n" +
                "Yeah\n" +
                "There's always gonna be another mountain\n" +
                "I'm always gonna wanna make it move\n" +
                "Always gonna be an uphill battle\n" +
                "Sometimes you're gonna have to lose\n" +
                "Ain't about how fast I get there\n" +
                "Ain't about what's waiting on the other side\n" +
                "It's the climb\n" +
                "Yeah, yeah\n" +
                "Keep on moving, keep climbing\n" +
                "Keep the faith, baby\n" +
                "It's all about, it's all about the climb\n" +
                "Keep your faith, keep your faith\n" +
                "Whoa"
    }
}