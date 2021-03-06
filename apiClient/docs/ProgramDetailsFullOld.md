# ProgramDetailsFullOld

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  [optional]
**level** | **Integer** |  |  [optional]
**levelProgress** | **Double** |  |  [optional]
**periodDuration** | **Integer** |  |  [optional]
**periodStarts** | [**DateTime**](DateTime.md) |  |  [optional]
**periodEnds** | [**DateTime**](DateTime.md) |  |  [optional]
**entryFeeSelected** | **Double** |  |  [optional]
**entryFeeCurrent** | **Double** |  |  [optional]
**successFeeSelected** | **Double** |  |  [optional]
**successFeeCurrent** | **Double** |  |  [optional]
**stopOutLevelSelected** | **Double** |  |  [optional]
**stopOutLevelCurrent** | **Double** |  |  [optional]
**isReinvesting** | **Boolean** |  |  [optional]
**isSignalProgram** | **Boolean** |  |  [optional]
**signalSuccessFee** | **Double** |  |  [optional]
**signalVolumeFee** | **Double** |  |  [optional]
**leverageMin** | **Integer** |  |  [optional]
**leverageMax** | **Integer** |  |  [optional]
**ageDays** | **Double** |  |  [optional]
**genesisRatio** | **Double** |  |  [optional]
**investmentScale** | **Double** |  |  [optional]
**volumeScale** | **Double** |  |  [optional]
**tradesDelay** | [**TradesDelayEnum**](#TradesDelayEnum) |  |  [optional]
**availableInvestmentBase** | **Double** | In account currency |  [optional]
**availableInvestmentLimit** | **Double** |  |  [optional]
**totalAvailableInvestment** | **Double** |  |  [optional]
**brokerDetails** | [**BrokerDetails**](BrokerDetails.md) |  |  [optional]
**statistic** | [**ProgramStatistic**](ProgramStatistic.md) |  |  [optional]
**personalProgramDetails** | [**PersonalProgramDetailsFull**](PersonalProgramDetailsFull.md) |  |  [optional]
**tags** | [**List&lt;ProgramTag&gt;**](ProgramTag.md) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**logo** | **String** |  |  [optional]
**url** | **String** |  |  [optional]
**color** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**title** | **String** |  |  [optional]
**ipfsHash** | **String** |  |  [optional]
**creationDate** | [**DateTime**](DateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**manager** | [**ProfilePublic**](ProfilePublic.md) |  |  [optional]

<a name="CurrencyEnum"></a>
## Enum: CurrencyEnum
Name | Value
---- | -----
UNDEFINED | &quot;Undefined&quot;
GVT | &quot;GVT&quot;
ETH | &quot;ETH&quot;
BTC | &quot;BTC&quot;
ADA | &quot;ADA&quot;
USDT | &quot;USDT&quot;
XRP | &quot;XRP&quot;
BCH | &quot;BCH&quot;
LTC | &quot;LTC&quot;
DOGE | &quot;DOGE&quot;
BNB | &quot;BNB&quot;
USD | &quot;USD&quot;
EUR | &quot;EUR&quot;

<a name="TradesDelayEnum"></a>
## Enum: TradesDelayEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
FIVEMINUTES | &quot;FiveMinutes&quot;
FIFTEENMINUTES | &quot;FifteenMinutes&quot;
THIRTYMINUTES | &quot;ThirtyMinutes&quot;
ONEHOUR | &quot;OneHour&quot;
SIXHOURS | &quot;SixHours&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
PENDING | &quot;Pending&quot;
ERRORCREATING | &quot;ErrorCreating&quot;
ACTIVE | &quot;Active&quot;
CLOSED | &quot;Closed&quot;
ARCHIVED | &quot;Archived&quot;
CLOSEDDUETOINACTIVITY | &quot;ClosedDueToInactivity&quot;
