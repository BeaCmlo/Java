import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>(); // CRIA UM HASHMAP


        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // CALCULA O COMPLEMENTO DO VALOR


            if (map.containsKey(complement)) { // SE A CHAVE O COMPLEMENTO DE N[I] JÁ APARECEU, ISSO QUE DIZER QUE ENCONTRAMOS OS ÍNDICES QUE SATISFAZEM TARGET

                return new int[] { map.get(complement), i }; // RETORNA OS ÍNDICES EM UM ARRAY DE DOIS ELEMENTOS
            }

            map.put(nums[i], i); // CHAVE E VALOR
        }

        throw new IllegalArgumentException("No two sum solution"); // DEPOIS DE TESTAR TODOS OS ELEMENTOS DO ARRAY NUMS, NÃO FORAM ENCONTRADOS NUMEROS QUE SATISFAZEM O TARGET
    }

    public static void main(String[] args) {
        Solution sol = new Solution();


        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = sol.twoSum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");


        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = sol.twoSum(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");


        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = sol.twoSum(nums3, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");
    }
}
