package com.lombok.iak.project_01networking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.lombok.iak.project_01networking.api.Repository;
import com.lombok.iak.project_01networking.model.Job;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * TODO - 07: Panggil API Client di sini untuk mengambil data dari API.
         * Gunakan ID: 2426ebf6-e641-11e5-8030-461e4e18f3ad
         * atau lainnya.
         */

        new Repository().getJob("2426ebf6-e641-11e5-8030-461e4e18f3ad", new Callback<Job>() {
            @Override
            public void onResponse(Call<Job> call, Response<Job> response) {
                Log.e("Job", "Judul job: " + response.body().getTitle());
                /**
                 * TODO - TASK_01: Tampilkan informasi Job di halaman Utama
                 */
            }

            @Override
            public void onFailure(Call<Job> call, Throwable t) {
                /**
                 * TODO - TASK_02: Tampilkan Error ketika terjadi kesalahan pengambilan data
                 */
            }
        });
    }
}
