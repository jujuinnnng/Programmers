-- 코드를 입력하세요
SELECT *
FROM (SELECT AI.ANIMAL_ID,	AO.NAME
        FROM ANIMAL_INS AI, ANIMAL_OUTS AO
        WHERE 1=1
        AND AI.ANIMAL_ID = AO.ANIMAL_ID
        ORDER BY AO.DATETIME - AI.DATETIME DESC)
WHERE ROWNUM <= 2;

