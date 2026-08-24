WITH cte AS (
    SELECT
        employee_id,
        YEAR(meeting_date) AS meeting_year,
        WEEK(meeting_date, 1) AS meeting_week,
        SUM(duration_hours) AS meeting_hours
    FROM meetings
    GROUP BY
        employee_id,
        YEAR(meeting_date),
        WEEK(meeting_date, 1)
)

SELECT
    c.employee_id,
    e.employee_name,
    e.department,
    COUNT(*) AS meeting_heavy_weeks
FROM cte c
JOIN employees e
    ON c.employee_id = e.employee_id
WHERE c.meeting_hours > 20
GROUP BY
    c.employee_id,
    e.employee_name,
    e.department
HAVING COUNT(*) >= 2
ORDER BY
    meeting_heavy_weeks DESC,
    e.employee_name ASC;