package co.edu.unipiloto.constraintlayoutlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonExerciseA;
    private Button buttonExerciseB;
    private Button buttonExerciseC;
    private Button buttonExerciseD;
    private Button buttonExerciseForm;
    private Button buttonExecisePostProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonExerciseA = findViewById(R.id.ExerciseA);
        buttonExerciseB = findViewById(R.id.ExerciseB);
        buttonExerciseC = findViewById(R.id.ExerciseC);
        buttonExerciseD = findViewById(R.id.ExerciseD);
        buttonExerciseForm = findViewById(R.id.ExerciseForm);
        buttonExecisePostProduct = findViewById(R.id.ExercisePostProduct);

    }

    public void goToExerciseA(View view){
        Intent intent = new Intent(this, ExerciseA.class);
        startActivity(intent);
    }
    public void goToExerciseB(View view){
        Intent intent = new Intent(this, ExerciseB.class);
        startActivity(intent);
    }
    public void goToExerciseC(View view){
        Intent intent = new Intent(this, ExerciseC.class);
        startActivity(intent);
    }
    public void goToExerciseD(View view){
        Intent intent = new Intent(this, ExerciseD.class);
        startActivity(intent);
    }

    public void goToExerciseForm(View view){
        Intent intent = new Intent(this, ExerciseForm.class);
        startActivity(intent);
    }
    public void goToExercisePostProduct(View view){
        Intent intent = new Intent(this, ExercisePostProduct.class);
        startActivity(intent);

    }

}