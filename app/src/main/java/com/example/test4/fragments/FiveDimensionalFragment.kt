package com.example.test4.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageButton
import com.example.test4.R
import com.example.test4.databinding.FragmentFiveDimensionalBinding


class FiveDimensionalFragment : Fragment() , View.OnClickListener {

    private var _binding: FragmentFiveDimensionalBinding? = null
    private val binding get() = _binding!!

    private var firstPlayerArray = mutableListOf<Int>()
    private var secondPlayerArray = mutableListOf<Int>()

    private var currentPlayer = 0
    private var roundPlayed = 0
    private var buttonNumber = 0
    private var winnerPlayer = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFiveDimensionalBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listeners()
    }


    private fun listeners() {

        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)
        binding.btn5.setOnClickListener(this)
        binding.btn6.setOnClickListener(this)
        binding.btn7.setOnClickListener(this)
        binding.btn8.setOnClickListener(this)
        binding.btn9.setOnClickListener(this)
        binding.btn10.setOnClickListener(this)
        binding.btn11.setOnClickListener(this)
        binding.btn12.setOnClickListener(this)
        binding.btn13.setOnClickListener(this)
        binding.btn14.setOnClickListener(this)
        binding.btn15.setOnClickListener(this)
        binding.btn16.setOnClickListener(this)
        binding.btn17.setOnClickListener(this)
        binding.btn18.setOnClickListener(this)
        binding.btn19.setOnClickListener(this)
        binding.btn20.setOnClickListener(this)
        binding.btn21.setOnClickListener(this)
        binding.btn22.setOnClickListener(this)
        binding.btn23.setOnClickListener(this)
        binding.btn24.setOnClickListener(this)
        binding.btn25.setOnClickListener(this)



        binding.btnReset.setOnClickListener(this)


        binding.btnReset.setOnClickListener {
            resetGame()
        }

    }

    override fun onClick(clickedView: View?) {
        if (clickedView is View) {


            when (clickedView.id) {
                R.id.btn1 -> buttonNumber = 1
                R.id.btn2 -> buttonNumber = 2
                R.id.btn3 -> buttonNumber = 3
                R.id.btn4 -> buttonNumber = 4
                R.id.btn5 -> buttonNumber = 5
                R.id.btn6 -> buttonNumber = 6
                R.id.btn7 -> buttonNumber = 7
                R.id.btn8 -> buttonNumber = 8
                R.id.btn9 -> buttonNumber = 9
                R.id.btn10 -> buttonNumber = 10
                R.id.btn11 -> buttonNumber = 11
                R.id.btn12 -> buttonNumber = 12
                R.id.btn13 -> buttonNumber = 13
                R.id.btn14 -> buttonNumber = 14
                R.id.btn15 -> buttonNumber = 15
                R.id.btn16 -> buttonNumber = 16
                R.id.btn17 -> buttonNumber = 17
                R.id.btn18 -> buttonNumber = 18
                R.id.btn19 -> buttonNumber = 19
                R.id.btn20 -> buttonNumber = 20
                R.id.btn21 -> buttonNumber = 21
                R.id.btn22 -> buttonNumber = 22
                R.id.btn23 -> buttonNumber = 23
                R.id.btn24 -> buttonNumber = 24
                R.id.btn25 -> buttonNumber = 25

            }
        }

        if (buttonNumber != 0) {
            playGame(clickedView as AppCompatImageButton, buttonNumber)
        }
    }

    private fun playGame(clickedView: AppCompatImageButton, buttonNumber: Int) {


        if (currentPlayer == 0) {
            clickedView.setBackgroundResource(R.drawable.x)
            currentPlayer = 1
            firstPlayerArray.add(buttonNumber)
            roundPlayed += 1

        } else {
            clickedView.setBackgroundResource(R.drawable.o)
            currentPlayer = 0
            secondPlayerArray.add(buttonNumber)
            roundPlayed += 1

        }
        clickedView.isEnabled = false
        checkWinner()

    }

    @SuppressLint("SetTextI18n")
    private fun checkWinner() {
        when {
            firstPlayerArray.contains(1) && firstPlayerArray.contains(2) && firstPlayerArray.contains(3) && firstPlayerArray.contains(4)
                    && firstPlayerArray.contains(5)->
                winnerPlayer = 1
            secondPlayerArray.contains(1) && secondPlayerArray.contains(2) && secondPlayerArray.contains(3) && secondPlayerArray.contains(4)
                    && secondPlayerArray.contains(5)->
                winnerPlayer = 2


            firstPlayerArray.contains(6) && firstPlayerArray.contains(7) && firstPlayerArray.contains(8) && firstPlayerArray.contains(9)
                    && firstPlayerArray.contains(10)->
                winnerPlayer = 1
            secondPlayerArray.contains(6) && secondPlayerArray.contains(7) && secondPlayerArray.contains(8) && secondPlayerArray.contains(9)
                    && secondPlayerArray.contains(10)->
                winnerPlayer = 2

            firstPlayerArray.contains(11) && firstPlayerArray.contains(12) && firstPlayerArray.contains(13) && firstPlayerArray.contains(14)
                    && firstPlayerArray.contains(15)->
                winnerPlayer = 1
            secondPlayerArray.contains(11) && secondPlayerArray.contains(12) && secondPlayerArray.contains(13) && secondPlayerArray.contains(14)
                    && secondPlayerArray.contains(15)->
                winnerPlayer = 2


            firstPlayerArray.contains(16) && firstPlayerArray.contains(17) && firstPlayerArray.contains(18) && firstPlayerArray.contains(19)
                    && firstPlayerArray.contains(20)->
                winnerPlayer = 1
            secondPlayerArray.contains(16) && secondPlayerArray.contains(17) && secondPlayerArray.contains(18) && secondPlayerArray.contains(19)
                    && secondPlayerArray.contains(20)->
                winnerPlayer = 2


            firstPlayerArray.contains(21) && firstPlayerArray.contains(22) && firstPlayerArray.contains(23) && firstPlayerArray.contains(24)
                    && firstPlayerArray.contains(25)->
                winnerPlayer = 1
            secondPlayerArray.contains(21) && secondPlayerArray.contains(22) && secondPlayerArray.contains(23) && secondPlayerArray.contains(24)
                    && secondPlayerArray.contains(25)->
                winnerPlayer = 2






            firstPlayerArray.contains(1) && firstPlayerArray.contains(6) && firstPlayerArray.contains(11) && firstPlayerArray.contains(16)
                    && firstPlayerArray.contains(21)->
                winnerPlayer = 1
            secondPlayerArray.contains(1) && secondPlayerArray.contains(6) && secondPlayerArray.contains(11) && secondPlayerArray.contains(16)
                    && secondPlayerArray.contains(21)->
                winnerPlayer = 2


            firstPlayerArray.contains(2) && firstPlayerArray.contains(7) && firstPlayerArray.contains(12) && firstPlayerArray.contains(17)
                    && firstPlayerArray.contains(22)->
                winnerPlayer = 1
            secondPlayerArray.contains(2) && secondPlayerArray.contains(7) && secondPlayerArray.contains(12) && secondPlayerArray.contains(17)
                    && secondPlayerArray.contains(22)->
                winnerPlayer = 2


            firstPlayerArray.contains(3) && firstPlayerArray.contains(8) && firstPlayerArray.contains(13) && firstPlayerArray.contains(18)
                    && firstPlayerArray.contains(23)->
                winnerPlayer = 1
            secondPlayerArray.contains(3) && secondPlayerArray.contains(8) && secondPlayerArray.contains(13) && secondPlayerArray.contains(18)
                    && secondPlayerArray.contains(23)->
                winnerPlayer = 2


            firstPlayerArray.contains(4) && firstPlayerArray.contains(9) && firstPlayerArray.contains(14) && firstPlayerArray.contains(29)
                    && firstPlayerArray.contains(24)->
                winnerPlayer = 1
            secondPlayerArray.contains(4) && secondPlayerArray.contains(9) && secondPlayerArray.contains(14) && secondPlayerArray.contains(19)
                    && secondPlayerArray.contains(24)->
                winnerPlayer = 2

            firstPlayerArray.contains(5) && firstPlayerArray.contains(10) && firstPlayerArray.contains(15) && firstPlayerArray.contains(20)
                    && firstPlayerArray.contains(25)->
                winnerPlayer = 1
            secondPlayerArray.contains(5) && secondPlayerArray.contains(10) && secondPlayerArray.contains(15) && secondPlayerArray.contains(20)
                    && secondPlayerArray.contains(25)->
                winnerPlayer = 2


            firstPlayerArray.contains(1) && firstPlayerArray.contains(7) && firstPlayerArray.contains(13) && firstPlayerArray.contains(19)
                    && firstPlayerArray.contains(25)->
                winnerPlayer = 1
            secondPlayerArray.contains(1) && secondPlayerArray.contains(7) && secondPlayerArray.contains(13) && secondPlayerArray.contains(19)
                    && secondPlayerArray.contains(25)->
                winnerPlayer = 2


            firstPlayerArray.contains(5) && firstPlayerArray.contains(9) && firstPlayerArray.contains(13) && firstPlayerArray.contains(17)
                    && firstPlayerArray.contains(21)->
                winnerPlayer = 1
            secondPlayerArray.contains(5) && secondPlayerArray.contains(9) && secondPlayerArray.contains(13) && secondPlayerArray.contains(17)
                    && secondPlayerArray.contains(21)->
                winnerPlayer = 2

        }

        when {
            winnerPlayer == 1 -> {
                binding.tvWinner.text = "${binding.tvWinner.text} X is winner "
                disableButtons()
            }
            winnerPlayer == 2 -> {
                binding.tvWinner.text = "${binding.tvWinner.text} O is winner "
                disableButtons()
            }
            roundPlayed == 9 -> {
                binding.tvWinner.text = "Game is Tie"
            }
        }

    }

    private fun disableButtons() {
        binding.btn1.isEnabled = false
        binding.btn2.isEnabled = false
        binding.btn3.isEnabled = false
        binding.btn4.isEnabled = false
        binding.btn5.isEnabled = false
        binding.btn6.isEnabled = false
        binding.btn7.isEnabled = false
        binding.btn8.isEnabled = false
        binding.btn9.isEnabled = false
        binding.btn10.isEnabled = false
        binding.btn11.isEnabled = false
        binding.btn12.isEnabled = false
        binding.btn13.isEnabled = false
        binding.btn14.isEnabled = false
        binding.btn15.isEnabled = false
        binding.btn16.isEnabled = false
        binding.btn17.isEnabled = false
        binding.btn18.isEnabled = false
        binding.btn19.isEnabled = false
        binding.btn20.isEnabled = false
        binding.btn21.isEnabled = false
        binding.btn22.isEnabled = false
        binding.btn23.isEnabled = false
        binding.btn24.isEnabled = false
        binding.btn25.isEnabled = false
    }

    private fun enableButtons() {
        binding.btn1.isEnabled = true
        binding.btn2.isEnabled = true
        binding.btn3.isEnabled = true
        binding.btn4.isEnabled = true
        binding.btn5.isEnabled = true
        binding.btn6.isEnabled = true
        binding.btn7.isEnabled = true
        binding.btn8.isEnabled = true
        binding.btn9.isEnabled = true
        binding.btn10.isEnabled = true
        binding.btn11.isEnabled = true
        binding.btn12.isEnabled = true
        binding.btn13.isEnabled = true
        binding.btn14.isEnabled = true
        binding.btn15.isEnabled = true
        binding.btn16.isEnabled = true
        binding.btn17.isEnabled = true
        binding.btn18.isEnabled = true
        binding.btn19.isEnabled = true
        binding.btn20.isEnabled = true
        binding.btn21.isEnabled = true
        binding.btn22.isEnabled = true
        binding.btn23.isEnabled = true
        binding.btn24.isEnabled = true
        binding.btn25.isEnabled = true
    }

    private fun resetGame() {
        binding.btn1.setBackgroundResource(R.color.black)
        binding.btn2.setBackgroundResource(R.color.black)
        binding.btn3.setBackgroundResource(R.color.black)
        binding.btn4.setBackgroundResource(R.color.black)
        binding.btn5.setBackgroundResource(R.color.black)
        binding.btn6.setBackgroundResource(R.color.black)
        binding.btn7.setBackgroundResource(R.color.black)
        binding.btn8.setBackgroundResource(R.color.black)
        binding.btn9.setBackgroundResource(R.color.black)
        binding.btn10.setBackgroundResource(R.color.black)
        binding.btn11.setBackgroundResource(R.color.black)
        binding.btn12.setBackgroundResource(R.color.black)
        binding.btn13.setBackgroundResource(R.color.black)
        binding.btn14.setBackgroundResource(R.color.black)
        binding.btn15.setBackgroundResource(R.color.black)
        binding.btn16.setBackgroundResource(R.color.black)
        binding.btn17.setBackgroundResource(R.color.black)
        binding.btn18.setBackgroundResource(R.color.black)
        binding.btn19.setBackgroundResource(R.color.black)
        binding.btn20.setBackgroundResource(R.color.black)
        binding.btn21.setBackgroundResource(R.color.black)
        binding.btn22.setBackgroundResource(R.color.black)
        binding.btn23.setBackgroundResource(R.color.black)
        binding.btn24.setBackgroundResource(R.color.black)
        binding.btn25.setBackgroundResource(R.color.black)

        firstPlayerArray.clear()
        secondPlayerArray.clear()
        winnerPlayer = 0
        roundPlayed = 0

        currentPlayer = 0

        enableButtons()
    }


}