Feature: Rates API

Scenario Outline:Verify currency get exchanged  for valid currency against Euro
Given Rates API for latest foreign Exchange rate
When User enter with <currency> and amount <amount>
Then currency convered as per latest rate into Euro




Examples:
|currency|amount|
| USD    |100   |